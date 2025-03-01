package org.example

interface CollisionHandler {
    fun checkCollisions(ball: BouncingBall, scene: GameScene)
}

class BoundaryCollisionHandler : CollisionHandler {
    override fun checkCollisions(ball: BouncingBall, scene: GameScene) {
        val radius = ball.getRadius()
        
        if (ball.getX() >= scene.getWidth() - radius || ball.getX() <= radius) {
            ball.getMovement().reverseX()
        }
        
        if (ball.getY() >= scene.getHeight() - radius || ball.getY() <= radius) {
            ball.getMovement().reverseY()
        }
    }
} 