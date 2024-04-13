package me.odinmain.features.impl.render

import me.odinmain.features.Category
import me.odinmain.features.Module
import me.odinmain.features.settings.impl.MapSetting

object VisualWords : Module(
    name = "Visual Words",
    category = Category.RENDER,
    description = ""
) {

    val wordsMap: MutableMap<String, String> by MapSetting("wordsMap", mutableMapOf(), "")

    @JvmStatic
    fun replaceText(text: String?): String? {
        if (!enabled || text == null) return text
        var replacedText = text
        for (actualText in wordsMap.keys) {
            replacedText = text.replace(actualText, wordsMap[actualText]!!)
        }
        return replacedText
    }

}