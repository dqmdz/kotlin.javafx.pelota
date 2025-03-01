package org.example

import javafx.animation.AnimationTimer

class GameLoop(
    private val ball: BouncingBall,
    private val collisionHandler: CollisionHandler,
    private val gameScene: GameScene
) {
    private val timer = object : AnimationTimer() {
        override fun handle(now: Long) {
            ball.update()
            collisionHandler.checkCollisions(ball, gameScene)
        }
    }
    
    init {
        gameScene.addGameObject(ball)
    }
    
    fun start() = timer.start()
    fun stop() = timer.stop()
} 