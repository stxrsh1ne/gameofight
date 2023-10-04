class Fight(private val player: Player, private val enemy: Enemy) {
    fun startFight() {
        while (player.health > 0 && enemy.health > 0) {
            player.attack(enemy)
            if (enemy.health > 0) {
                enemy.attack(player)
            }
        }

        println("Player's health: ${player.health}")
        println("Enemy's health: ${enemy.health}")
        println("Player's healing potions: ${player.healingPotion}")

        if (player.health <= 0) {
            println("Player lost the fight.")
        } else {
            println("Player won the fight.")
        }
    }
}