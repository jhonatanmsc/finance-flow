package org.example

import javafx.application.Application
import javafx.application.Application.launch
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.stage.Stage

fun main(args: Array<String>) {
    launch(HelloWorldApp::class.java)
}

class HelloWorldApp : Application() {
    override fun start(stage: Stage) {
        val layout = VBox().apply {
            children.add(Label("Hello, World!"))
        }
        stage.run {
            scene = Scene(layout)
            show()
        }
    }
}

