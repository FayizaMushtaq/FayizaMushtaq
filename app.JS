const express = require("express");
const alert  = require("alert");

const app = express();
require("../db/comm");
const Register =require("../model/registration");
const path = require("path");
const { Script } = require("vm");
const port = process.env.PORT || 8000;
//static path
const static_path = path.join(__dirname,"../../public");
app.use(express.json());
app.use(express.urlencoded({extended:false}));
app.use(express.static(static_path));
app.get("/registration",(req,res)=>{
   res.render("registration");
})
app.post("/registration",async (req,res)=>{
  try
  {
     const password=req.body.password;
     const cpassword=req.body.cpassword;

     if (password==cpassword){
         const qftregistration =new Register({
             firstname:req.body.fname,
             lastname:req.body.lname,
             email:req.body.email,
             contact:req.body.contact,
             gender:req.body.gen,
             password:req.body.password,
             confirmpassword:req.body.cpassword
         })
         const registered = await qftregistration.save();
         alert("WELCOME TO QFT TREVEL ENGINE YOU HAVE SUCCESSFULLY COMPLETE YOUR REGISTRATION");
         res.sendFile(path.join(__dirname,"../../public/index.html"));
         
     }else{
        alert("plz write same password in both password and confirm password box");
     }

  }  catch(error)
  {
      alert("EMAIL AND PHONE NUMBER SHOULD BE UNIQUE");
      
  }
})


app.post("/login", async(req,res)=>{
    try
    {
         const email = req.body.email;
         const password = req.body.password;
         console.log(`${email} and password is ${password}`)
         const useremail= await Register.findOne({email:email});
         if(useremail.password === password){
            alert("YOU GET SUCCESSFULLY LOGGED IN");
            res.sendFile(path.join(__dirname,"../../public/index.html"));
        }else{
             alert("PLZ ENTER THE CORRECT DETAILS");
         }

    }catch(error)
    {
        alert("PLZ ENTER THE CORRECT DETAILS");
    }
})

app.listen(port,()=>{
console.log(`this is port no ${port}`)
});

