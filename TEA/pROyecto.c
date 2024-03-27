#include <LiquidCrystal.h>

LiquidCrystal lcd(8, 9, 10, 11, 12, 13); // Conecta la pantalla LCD a los pines del Arduino

const int player1ButtonPin = 2;
const int player1LEDPin = 3;
const int player2ButtonPin = 4;
const int startButtonPin = 7;
const int calibrateButtonPin = 6;

enum GameState { WELCOME, MENU, RULES, PLAY };
GameState gameState = WELCOME;

unsigned long player1StartTime = 0;
unsigned long player2StartTime = 0;
const unsigned long startButtonHoldDuration = 2000; // Duración en milisegundos para que ambos jugadores presionen el botón para iniciar
const int lcdWidth = 16;  // Ancho de la pantalla LCD
const int lcdHeight = 2;  // Altura de la pantalla LCD

void setup() {
  pinMode(player1ButtonPin, INPUT_PULLUP);
  pinMode(player2ButtonPin, INPUT_PULLUP);
  pinMode(startButtonPin, INPUT_PULLUP);
  pinMode(calibrateButtonPin, INPUT_PULLUP);
  lcd.begin(16, 2); // Inicializa la pantalla LCD
  lcd.clear(); // Limpia la pantalla
}

void loop() {
  switch (gameState) {
    case WELCOME: {
      const char* frase = "Bienvenido al juego de velocidad. Para empezar con el juego debes precionar 1 vez 2 veces para inciiar el juego 3 veces para reglas";
      
      int fraseLength = strlen(frase);

      int delayTime = 100; // Ajusta el retraso según la velocidad deseada

      for (int verticalOffset = 0; verticalOffset <= fraseLength; verticalOffset++) {
        lcd.clear(); // Borra la pantalla
        for (int row = 0; row < lcdHeight; row++) {
          lcd.setCursor(0, row);
          for (int col = 0; col < lcdWidth; col++) {
            int index = row * lcdWidth + col + verticalOffset;
            if (index < fraseLength) {
              lcd.write(frase[index]);
            }
          }
        }
        delay(delayTime);
      }
      //gameState = MENU; // Cambia al estado del menú después de mostrar el mensaje de bienvenida
      break;
    }

    case MENU:
      // En el menú, muestra las opciones y espera a que los jugadores elijan
      lcd.clear();
      lcd.setCursor(0, 0);
      lcd.print("1. Empezar Juego");
      lcd.setCursor(0, 1);
      lcd.print("2. Ver Reglas");

      if (digitalRead(startButtonPin) == LOW) {
        gameState = PLAY; // Cambia al estado de juego
        lcd.clear();
        lcd.setCursor(0, 0);
        lcd.print("¡Que comience el juego!");
        delay(1000);
        // Aquí podrías inicializar la lógica de tu juego
      }
      // Aquí podrías agregar la lógica para ver reglas
      break;

    case RULES:
      // En el estado de reglas, podrías mostrar las reglas del juego
      lcd.clear();
      lcd.setCursor(0, 0);
      lcd.print("Reglas del Juego:");
      lcd.setCursor(0, 1);
      lcd.print("1. ...");
      // Muestra las reglas
      // Luego, vuelve al estado MENU
      gameState = MENU;
      break;

    case PLAY:
      // Aquí iría la lógica principal del juego
      // Implementa lo que sucede durante el juego
      // Puedes añadir más estados y transiciones según sea necesario
      // Asegúrate de tener una forma de salir del juego y volver al menú principal
      // gameState = MENU; // Ejemplo de cómo volver al menú
      break;
  }
}