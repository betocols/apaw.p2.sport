# apaw.p2.sport
APAW second proyect: Creation of a RESTful API for a Sport software.
Alberto Cols

### Endpoints:

## GET 

> *****/users***
 
 Devuelve todos los usuarios (nick:email)

> *****/users/search?sport=****
 
 Devuelve todos los usuarios que practican un deporte (nick)

 ---------

## POST

> *****/users body=nick:email***
 
 Se crea un usuario
 Si se intenta un Nick que ya existe debe dar un mensaje de error

> *****/sports body=name***
 
 Se crea un deporte
 Si se intenta un deporte que ya existe debe dar un mensaje de error

 ---------

## PUT

> *****/users/{nick}/sport body=sportName***
 
 Se añade un deporte a un usuario
 Se pueden añadir varios deportes
 Si se intenta un deporte que no existe debe dar un error
