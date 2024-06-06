package woowacourse.shopping.presentation.ui.cart

import woowacourse.shopping.presentation.ui.counter.CounterHandler

interface CartItemCountHandler : CounterHandler {
    override fun increaseCount(
        productId: Long,
        quantity: Int,
    )

    override fun decreaseCount(
        productId: Long,
        quantity: Int,
    )
}
