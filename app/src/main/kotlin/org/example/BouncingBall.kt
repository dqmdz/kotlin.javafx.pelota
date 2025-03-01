package org.example

import javafx.scene.paint.Color
import javafx.scene.shape.Circle

class BouncingBall(
    radius: Double,
    initialX: Double,
    initialY: Double,
    private val movement: Movement
) : GameObject {
    override val node = Circle(radius, Color.RED).apply {
        centerX = initialX
        centerY = initialY
    }
    
    override fun update() {
        node.centerX += movement.velocityX
        node.centerY += movement.velocityY
    }
    
    fun getRadius(): Double = (node as Circle).radius
    fun getX(): Double = node.centerX
    fun getY(): Double = node.centerY
    fun getMovement(): Movement = movement
} 