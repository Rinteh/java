//First name------------------------------------------

function allLetter(inputtxt)
      { 
      var letters = /^[A-Za-z]+$/;
      if(inputtxt.value.match(letters))
      {
      alert('Your name have accepted : you can try another');
	  document.form1.name1.focus();
      return true;
      }
      else
      {
      alert('Please input alphabet characters only');
      return false;
      }
      }
	  
//Adress------------------------------------------

function alphanumeric(inputtxt)
{ 
var letters = /^[0-9a-zA-Z]+$/;
if(inputtxt.value.match(letters))
{
alert('Your adress is correct: you can try another');
document.form1.ADR.focus();
return true;
}
else
{
alert('Please input alphanumeric characters only');
return false;
}
}


//Postal Code------------------------------------------  

function letters(inputtxt)
      { 
      var letters = /^[A-Za-z]+$/;
      if(inputtxt.value.match(letters))
      {
      alert('Your Postal Code have accepted : you can try another');
	  document.form1.PCD.focus();
      return true;
      }
      else
      {
      alert('Please input alphabet characters only');
      return false;
      }
      }
	  
	  
	  //Drop down list------------------------------------------
	  
	  function Validate() {
        var prov= document.getElementById("prov");
        if (prov.value == "Default") {
            //If the "Please Select" option is selected display error.
            alert("Please select a Province!");
            return false;
        }
        return true;
    }
	 
//Username------------------------------------------	
 
	  function Userlen(inputtxt, )
{ 
var field = inputtxt.value; 
var mnlen = 6;
var mxlen = 8;

if(field.length<mnlen || field.length> mxlen)
{ 
alert("Please input the Username between " +mnlen+ " and " +mxlen+ " characters");
document.form1.USN.focus();
return false;
}
else
{ 
alert('Your username accepted.');
return true;
}
}

//Email

 function ValEmail(inputtxt)
{
var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
if(inputtxt.value.match(mailformat))
{
alert("Valid email address!");
document.form1.EMA.focus();
return true;
}
else
{
alert("You have entered an invalid email address!");
document.form1.EMA.focus();
return false;
}
}