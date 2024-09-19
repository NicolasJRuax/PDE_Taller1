https://github.com/NicolasJRuax/PDE_Taller1.git


# Proyecto de Programación Dirigida por Eventos

## Descripción

Este proyecto es una aplicación Android sencilla que demuestra el uso de la programación dirigida por eventos. La aplicación tiene múltiples actividades, cada una de las cuales reacciona a las interacciones del usuario, como presionar botones y cambiar configuraciones. La aplicación utiliza `SharedPreferences` para guardar datos persistentes como el color de fondo y el nombre de usuario.

## Funcionalidades

1. **Pantalla principal (MainActivity)**:
    - Muestra un saludo basado en la hora del día.
    - Permite al usuario cambiar de actividad.

2. **Pantalla de configuración (SettingsActivity)**:
    - Permite cambiar el color de fondo de la aplicación y guarda la selección de color en las preferencias compartidas.

3. **Pantalla de usuario (UserActivity)**:
    - Permite ingresar y guardar el nombre de usuario, que se utiliza para personalizar el saludo.

4. **Pantalla de configuración avanzada (ConfigActivity)**:
    - Botón para regresar a la pantalla anterior.

## Estructura del código

- `MainActivity.java`: Contiene la lógica principal de la aplicación, mostrando un saludo personalizado y la opción de cambiar a la pantalla de usuario.
- `UserActivity.java`: Gestiona el ingreso y almacenamiento del nombre de usuario.
- `SettingsActivity.java`: Permite al usuario cambiar el color de fondo de la aplicación.
- `ConfigActivity.java`: Una actividad secundaria que muestra un botón para volver a la pantalla anterior.

## Dependencias

- Android SDK
- Librerías estándar de Android (Intent, SharedPreferences)

## Instalación y Uso

1. Clonar este repositorio.
2. Abrir el proyecto en Android Studio.
3. Ejecutar el proyecto en un emulador o dispositivo Android.

## Tests

Se incluye una clase de prueba con JUnit para verificar la lógica de la aplicación, tales como:
- Correcto establecimiento del mensaje de saludo.
- Persistencia del color de fondo en las preferencias compartidas.

