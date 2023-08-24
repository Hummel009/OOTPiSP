package hummel.transport

import hummel.optional.Improvable

class CarLadaImproved(price: Int = 6000, color: String = "") : CarLada(price, color), Improvable {
	private lateinit var improvement: String

	override fun getImprovement(): String = improvement

	override fun setImprovement(improvement: String): Transport {
		this.improvement = improvement
		return this
	}

	override fun getTheInfo(): String = "Lada ($color, $improvement): $price$"
}