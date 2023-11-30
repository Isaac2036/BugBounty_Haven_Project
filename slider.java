window.addEventListener('load', function(){
            var imagenes = [];
            imagenes[0] = 'img/1.jpg';
            imagenes[1] = 'img/2.jpg';
            imagenes[2] = 'img/3.jpg';
            var indice = 0;

            function cambiarImagen(){
                document.slider.src = imagenes[indice];
                if (indice < 3) {
                    indice++;
                }else {
                    indice = 0;
                }
            }
            setInterval(cambiarImagen, 3000)
        })