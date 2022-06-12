package part01.adapter.inheritance

import part01.adapter.Banner
import part01.adapter.Print

//상속을 통한 어댑터
class PrintBannerInheritance(
    name: String
) : Print, Banner(name) {
    override fun printWeak() {
        super.showWithParen()
    }

    override fun printStrong() {
        super.showWithAster()
    }
}