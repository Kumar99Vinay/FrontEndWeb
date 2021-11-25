$(function(){

let imgnode=$('#image');
let buttonnode=$('#ZOOMIN');
buttonnode.click(function(){
    let h=imgnode.height();
    let w=imgnode.width();
    if(buttonnode.html()=="ZoomIn"){
        let state=window.confirm("Do you want ZoomIn");
        if(state==true){
            
            ZoomInfun(h,w);
        }
        else
             buttonnode.html("ZoomOut");
    }
    else{
        let state=window.confirm("Do you want ZoomIn");
        if(state==true){
            ZoomOutfun(h,w);
        }
        else{
            buttonnode.html("ZoomIn");
        }
    }
});

function ZoomInfun(h,w){
    imgnode.height(h+100);
    imgnode.width(w+100);
}
function ZoomOutfun(h,w){
    imgnode.height(h-100);
    imgnode.width(w-100);

}


// var imgs = ['../HTML/Demoimages/gani1.jpg',
//     '../HTML/Demoimages/gani2.jpg',
//     '../HTML/Demoimages/gani3.jpg'];
//     var cnt = imgs.length;

//     $(function() {
//         setInterval(Slider, 3000);
//     });

//     function Slider() {
//     $('#imageSlide').fadeOut("slow", function() {
//        $(this).attr('src', imgs[(imgs.length++) % cnt]).fadeIn("slow");
//     });
//     }

    var imgs = ['C:\Users\Downloads\myimage\ganesha1.jpg',
    'C:\Users\Downloads\myimage\ganesha1.jpg',
    'C:\Users\Downloads\myimage\ganesha3.jpg'];
    for(let i=0;i<imgs.length;i++)
    {
        $('#imageSlide').fadeOut("slow", function() {
        $('#imageSlide').attr('src', imgs[i]).fadeIn('slow');
    });
    }

});