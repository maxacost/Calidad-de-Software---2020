$(document).ready(function () {
    createExamen = function (){
        var prof = $('#profe').val();
        $.ajax({
            url:"examencontroller.do",
            data:{
                profe: prof,
                action: "crearExamen"
            },
            success:function (result){
                $('#tabla tbody tr').each(function(idx, fila){
                    id=fila.children[0].innerHTML;
                    $.ajax({
                         url:"examencontroller.do",
                         data:{
                             idPregunta: id,
                             action: "examenP"
                         },
                         success:function (result){
                           
                         }
                     });
                });
                alert("Se registraron todas las preguntas con exito!!");
                $("#tabla tbody").remove();
                $('#profe').val("");
            }
        });
        
    }
});
function pasarPreguntas(id,pregunta){
    $("#tabla").append('<tr><td class="hidden">'+id+'</td><td>'+pregunta+'</td><td><button type="button" class="btn btn-danger" onclick="removeTd(this)"><i class="fas fa-trash-alt"></i></button></td></tr>');
}
function removeTd(r){
    var i = r.parentNode.parentNode.rowIndex;
    document.getElementById("tabla").deleteRow(i);
}