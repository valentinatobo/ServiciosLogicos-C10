# ServiciosLogicos-C10
#SERVICIOS 

Proyecto Grupo de Trabajo Interface Grafica 
Diana Valentina Uscategui Tobo - 20172020063

Se agrego el uso de servicios para el manejo de información externa y se hizo el uso de dicho servicio en distintas clases para obtener la información.

## Creación nuevas clases y carpetas 

Se crearon algunas clases para el uso del servicio y el manejo de la información, como por ejemplo la carpeta archives con un archivo txt.

![Carpetas](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/carpetas.PNG)

## Servicios Lógicos

se encargan de contener información externa y que sera solicitada por varas partes de nuestro proyecto. Siempre serán solicitados por las clases Component de nuestros componentes.

## Servicio que recibe información externa

Este tipo de servicios no contienen la información externa directamente, sino que deben obtenerla desde algún sistema, estos pueden ser algún servidor externo, alguna base de datos externa, entre otros. Para este caso vamos a manejar la información de los usuarios que ya están registrados en el sistema y que solo ellos pueden entrar, la información esta contenida en el archivo plano usuarios.txt.

![txt](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/txt.PNG)

### Creación Modelo

Cremos un modelo que represente el objeto de los usuarios, dentro de la clase Usuario se crean atributos de un usuario como nombreusuario y clave usuario y sus respectivos get y set.

![claseusuario](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/calseusuario.PNG)

### Simulación Controlador

Ahora vamos a simular un controlador de información externa de forma local, 
generalemente la aplicación de interfaz gráfica se comunicara con Apis externas.

En la carpeta creada en el inicio login se crea una clase ControlUsuarios y esta sera la clase encargada de obtener, contener y gestionar la información.

![clasecontrolusuario](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/controlusuario.PNG)

### Creación Servicio UsuarioService

Este servicio va contener dos atributos que serán importantes, un atributo sera el objeto del controlador para que exista una comunicación hacia ese controlador, la otra sera un string que contiene que usuario sera logeado.

![usuarioservice](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/usuarioservice.PNG)

Ahora se le cambia la funcionalidad al botón Iniciar Sesión del login, ya no se llamara mostrar información el metodo que ejecuta el boton su no enviardatos usuario.

![biniciosesión](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/botonis.PNG)

Dentro del método enviarDatosUsuario vamos a dejar la obtención de los datos de las dos cajas de texto el resto no sera necesario. Se enviaran los datos a nuestro servicio Usuarioservice para realizar la respectiva validación, en caso de estar todo bien mostrara un mensaje indicando el inicio de sesión y entrara a la ventana principal, de no ser así enviara un mensaje de error.

![metodoenvar](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/enviardatos.PNG)

![datosbien](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/datosbien.PNG)

![datosmal](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/datosmal.PNG)

Ahora lo que haremos es que gracias al serviicio podremos cambiar la imagen y nombre de usuario dinamicamente cuando entremos con cuentas diferentes a la predeterminada. 

En el controlador ControlUSuarios creamos un método que retorne a un usuario de acuerdo a su nombre, vamos entonces a la clase ControlUsuarios y realizamos el siguiente método:

![controlusuarios](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/devolverusus.PNG)

Ahora dentro del servicio UsuarioService crearemos un método para poder obtener dicho usuario:

![getusuario](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/getusuario.PNG)

En este caso le vamos a enviar como argumento al método del controlador el atributo usuarioLogeado que si recordamos, le habíamos dado un valor justo en el momento en que el login se verifico de forma exitosa:

![verificacionusulog](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/verificacionusulog.PNG)

Vamos a crear un atributo que se llamara usuarioLogeado y sera de tipo Usuario, una vez declarado, usaremos el servicio UsuarioService para obtener el objeto del usuario logueado.

![getusuariolog](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/getusuariologe.PNG)

Finalmente nos ubicamos dentro de la clase NavegacióUsuarioTemplate y vamos a realizar unos pequeños cambios con los label que muestran la imagen y nombre del usuario:

![cambiostemplate](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/cambiostemplate.PNG)

![imagencambiada1](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/imgencambia1.PNG)

![imagencambiada2](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/imgcambia2.PNG)

### Ajustes al proyecto 

Hay partes del proyecto que requieren una actualización, a continuación se mencionan algunas de ellas:

* Cuando se cierra sesión y se ingresa nuevamente con otro usuario es necesario actualizar datos del componente navegacion e inicio usuario.

* Cuando un usuario cierra sesión y se ve nuevamente el Login, este tiene aun los datos que escribió el usuario cuando ingreso, se debería ver justo como cuando se inicia la aplicación

* Cuando ingresamos por segunda vez en una misma ejecución a la vista principal, no se muestra el componente inicio y se ve vacía la parte del panel principal.

![login1](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/loginentrada.PNG)

![entrada1](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/entrada1.PNG)

![logincese](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/logincerrarsesion.PNG)

![login2](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/login2en.PNG)

![entrada2](https://github.com/valentinatobo/ServiciosLogicos-C10/blob/master/Proy_Twitter/imagenes/segundaentrada.PNG)