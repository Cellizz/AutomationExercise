Feature: Agregar Doctor

@addDoctor
Scenario: Agregar Doctor
Given El usuario ingresa a la url and hace click en Agregar Doctor
When El usuario ingresa el nombre Juan en el campo Nombre Completo
And ingresa el apellido Luna en el campo Apellidos
And ingresa 12345678 en el campo Telefono
And selecciona Cedula de Ciudadania de la lista Tipo de documento de identidad
And presiona el boton Guardar
Then debe mostrarse el mensaje Datos guardados correctamente.


