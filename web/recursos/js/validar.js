/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validar(){
    var correo, clave, expresion,aceptar;
    correo = document.getElementById("txtCorreo").value;
    aceptar = document.getElementById("chkAceptar").checked;
    expresion = /\w+@+\w+\.+[a-z]{2,4}/;
    if(correo === ""){
        alertify.alert("Mensaje Importante","Debera de ingresar su cuenta de correo").set('label','Aceptar');
        return false;
    }
    else if (correo.length<=3){
        alertify.alert("Mensaje Importante","Cuenta de correo debera de ser mayor a 3 caracteres").set('label','Aceptar');
        return false;
    }
    else if (!expresion.test(correo)){
        console.log(correo);
        alertify.alert("Mensaje Importante","Ingrese una cuenta de correo valida").set('label','Aceptar');
        return false;
    }
    if(!aceptar){
        alertify.alert("Mensaje Importante","Debera de aceptar los terminos y condiciones").set('label','Aceptar');
        return false;
        
    }
}






