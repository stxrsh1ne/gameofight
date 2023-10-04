fun main() {
    val player = Player(12, "Player", 4)
    val enemy = Enemy(8, 3, "Enemy", 15,)

    val fight = Fight(player, enemy)
    fight.startFight()
}