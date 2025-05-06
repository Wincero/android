package com.example.lab4.data

import com.example.lab4.data.model.Place
import com.example.lab4.data.model.PlaceCategory
import com.example.lab4.R

object PlacesRepository {
    private val allPlaces = listOf(
        Place(
            id = 1,
            name = "Парк имени Кирова",
            category = PlaceCategory.PARKS,
            description = "Парк Кирова – самая большая в Ижевске лесопарковая территория. Это место для прогулок, велоспорта, пробежек. Зимой тут организованы каток и лыжная трасса, благодаря сохраненному рельефу местности, здесь регулярно проходят спортивные состязания по скандинавской ходьбе.",
            address = "ул. Кирова, 8а",
            workingHours = "10:00 - 22:00",
            imageRes = R.drawable.park_kirova,
            phone = "+7 (3412) 51-20-14"
        ),
        Place(
            id = 2,
            name = "Летний сад имени Горького",
            category = PlaceCategory.PARKS,
            description = "Парк Горького – одно из самых известных и старейших общественных пространств Ижевска. Это место сосредоточения городских аттракционов, здесь проходят масштабные мероприятия, праздники и аутентичные фестивали.",
            address = "ул. Милиционная, 4",
            workingHours = "10:00 - 22:00",
            imageRes = R.drawable.letniy_sad,
            phone = "+7-912-450-00-12"
        ),
        Place(
            id = 3,
            name = "Парк Космонавтов",
            category = PlaceCategory.PARKS,
            description = "Парк Космонавтов — популярное место для семейного отдыха в районе Буммаш в Ижевске. В теплое время года посетители могут насладиться прогулкой по тенистым аллеям и извилистым дорожкам, прокатиться на аттракционах и увидеть уменьшенную модель солнечной системы.",
            address = "Воткинское шоссе, 118",
            workingHours = "10:00 - 21:00",
            imageRes = R.drawable.park_kosmonavtov,
            phone = "+7 (3412) 44-05-22"
        ),
        Place(
            id = 4,
            name = "Кинотеатр \"Киномакс\"",
            category = PlaceCategory.CINEMAS,
            description = "\"Киномакс-Ижевск\" – это 6 стильных комфортабельных залов на 1036 мест, оснащенных новейшим кинопроекционным оборудованием и акустической аппаратурой с технологией Dolby Digital для полного погружения в любимые фильмы.",
            address = "ул. Холмогорова, 11",
            workingHours = "10:00 - 02:00",
            imageRes = R.drawable.kinomax,
            phone = "+7 (495) 725-64-00"
        ),
        Place(
            id = 5,
            name = "Кинотеатр \"Алмаз-синема\"",
            category = PlaceCategory.CINEMAS,
            description = "«Алмаз Синема Матрица» - это новый семейный кинотеатр сети «Алмаз Синема», расположенный на 3-ем этаже Молла «Матрица». Просторная бесплатная парковка, удобные мягкие кресла, гостеприимный персонал и главное – доступные цены - создают домашнюю атмосферу. Это отличное место, где можно собрать всю семью, отметить памятную дату и просто весело провести время!",
            address = "ул. Баранова, 87",
            workingHours = "10:00 - 03:00",
            imageRes = R.drawable.almaz,
            phone = "+7 (3412) 27-74-58"
        ),
        Place(
            id = 6,
            name = "Кинотеатр \"Империя грёз\"",
            category = PlaceCategory.CINEMAS,
            description = "Кинотеатр «Империя Грёз» расположен в самом центре Ижевска. В нем пять залов общей вместимостью 740 человек. Все залы оснащены «парящими серебряными экранами»: изображение занимает всю плоскость, а лишний свет поглощается специальным покрытием, так что картинка будто парит в воздухе. ",
            address = "пер. Широкий, 53",
            workingHours = "10:00 - 22:00",
            imageRes = R.drawable.empire,
            phone = "+7 (3412) 90-55-15"
        ),
        Place(
            id = 7,
            name = "ТРЦ \"Петровский\"",
            category = PlaceCategory.SHOPPING_CENTERS,
            description = "ТРК «Петровский» – современный торговый центр, в котором представлены магазины лучших брендов и развлечения для всей семьи:\n" +
                    "✔ более 200 магазинов\n" +
                    "✔ фуд-корт с самой разнообразной кухней\n" +
                    "✔ многозальный кинотеатр «Синема Парк»\n" +
                    "✔ семейный занимательный парк «KIDO»\n" +
                    "✔ боулинг-клуб, бильярд, караоке\n" +
                    "✔ гипермаркет «Гастроном»\n",
            address = "ул. Петрова, 29",
            workingHours = "10:00 - 22:00",
            imageRes = R.drawable.petrovskiy,
            phone = "+7 (3412) 933-315"
        ),
        Place(
            id = 8,
            name = "ТРЦ \"Матрица-Молл\"",
            category = PlaceCategory.SHOPPING_CENTERS,
            description = "Молл Матрица - торгово-развлекательный центр в Ленинском районе Ижевска!\n" +
                    "4 этажа Молла включают в себя более 130 магазинов и развлекательных площадок!\n" +
                    "- Продуктовый гипермаркет ЛЕНТА\n" +
                    "- Кинотеатр АЛМАЗ СИНЕМА\n" +
                    "- Спортивный клуб и бассейн Fitness House\n" +
                    "- Боулинг\n" +
                    "- Рестораны и фуд-корт\n" +
                    "- Детский парк развлечений\n" +
                    "- Одежда и обувь\n" +
                    "- Гипермаркет техники М Видео\n" +
                    "- Парфюмерия и косметика\n" +
                    "- Товары для детей",
            address = "ул. Баранова, 87",
            workingHours = "08:00 - 22:00",
            imageRes = R.drawable.matrix,
            phone = "+7 (3412) 95-63-95"
        ),
        Place(
            id = 9,
            name = "ТЦ \"Флагман\"",
            category = PlaceCategory.SHOPPING_CENTERS,
            description = "ТЦ Флагман расположен в самом центре Ижевска. Это семейная площадка, где каждый может найти то, что придётся по душе: одежду, обувь, парфюмерию, косметику и аксессуары.\n",
            address = "ул. Удмуртская, 255",
            workingHours = "10:00 - 22:00",
            imageRes = R.drawable.flagman,
            phone = "+7 (3412) 320-321"
        )
    )

    fun getCategories(): List<PlaceCategory> {
        return PlaceCategory.entries
    }

    fun getPlacesByCategory(category: PlaceCategory): List<Place> {
        return allPlaces.filter { it.category == category }
    }

    fun getPlaceById(id: Int): Place? {
        return allPlaces.firstOrNull { it.id == id }
    }
}