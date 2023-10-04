class Player(health: Int, name: String, var healingPotion: Int) : Creature(5, 3, health, name) {
    private val minHealth = health * 0.4
    private val maxHealth = health

    override fun attack(target: Creature) {
        super.attack(target)

        if (healingPotion > 0 && health <= minHealth) {
            val healingAmount = (maxHealth * 0.3).toInt()
            health += healingAmount
            healingPotion--
            println("$name used a healing potion and restored $healingAmount health. Current health: $health")
        }
    }
}