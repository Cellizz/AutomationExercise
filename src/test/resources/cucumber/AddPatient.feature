Feature: Agregar Paciente

@addPaciente
Scenario: Agregar Paciente
Given El usuario hace click en Inicio
And hace click en Agregar Paciente
When El usuario ingresa el nombre "Juan" en el campo Nombre Completo
And ingresa el apellido "Luna" en el campo Apellidos
And ingresa 12345678 en el campo Telefono
And selecciona Cedula de Ciudadania de la lista Tipo de documento de identidad
And ingresa 123 en el campo Documento de identidad
And presiona el boton Guardar
Then debe mostrarse el mensaje Datos guardados correctamente.


