import kotlin.random.Random

@Suppress("NAME_SHADOWING")
open class Creature(private var attack: Int, private var defence: Int, var health: Int, var name: String) {

    init {
        this.attack = attack.coerceIn(0, 30)
        this.defence = defence.coerceIn(0, 30)
    }

    open fun takeDamage(damage: Int) {
        health -= damage
        println("$name took $damage damage. Current health: $health")
    }

    open fun attack(target: Creature) {
        val attackModifier = (attack - target.defence) + 1
        val diceRoll = attackModifier.coerceAtLeast(1)
        var successHit = false

        repeat(diceRoll) {
            val diceRoll = Random.nextInt(1, 7)
            if (diceRoll == 5 || diceRoll == 6) {
                successHit = true
            }
            return@repeat
        }
        if (successHit) {
            val damage = Random.nextInt(1, 7)
            target.takeDamage(damage)
        }
    }
}