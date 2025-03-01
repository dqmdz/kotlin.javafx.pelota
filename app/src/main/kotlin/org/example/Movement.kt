package org.example

interface Movement {
    var velocityX: Double
    var velocityY: Double
    fun reverseX()
    fun reverseY()
}

class LinearMovement(
    override var velocityX: Double,
    override var velocityY: Double
) : Movement {
    override fun reverseX() {
        velocityX *= -1
    }
    
    override fun reverseY() {
        velocityY *= -1
    }
} 