package part01.adapter.delegation

import part01.adapter.Banner
import part01.adapter.Print

//= 위임을 통한 어뎁터 =//
class PrintBannerDelegation(
    name: String
) : Print{
    private val banner: Banner
    init{
        banner = Banner(name)
    }

    override fun printWeak() {
        banner.showWithParen()
    }

    override fun printStrong() {
        banner.showWithAster()
    }
}
