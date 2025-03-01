package org.example

import javafx.scene.Scene
import javafx.scene.layout.Pane

class GameScene(width: Double, height: Double) {
    private val root = Pane()
    val scene = Scene(root, width, height)
    
    fun addGameObject(gameObject: GameObject) {
        root.children.add(gameObject.node)
    }
    
    fun getWidth(): Double = scene.width
    fun getHeight(): Double = scene.height
} 