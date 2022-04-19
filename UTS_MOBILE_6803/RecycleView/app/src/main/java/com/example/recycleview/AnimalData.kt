package com.example.recycleview

object AnimalData {
    private val animalname = arrayOf("dara",
        "elang",
        "jalak",
        "kakaktua",
        "pipit")

    private val animaldetail = arrayOf("dara", "elang","jalak","kakaktua","pipit")

    private val animalImages = intArrayOf(R.drawable.dara,
        R.drawable.elang,
        R.drawable.jalak,
        R.drawable.kakaktua,
        R.drawable.pipit)

    val listData: ArrayList<bird>
        get() {
            val list = arrayListOf<bird>()
            for (position in animalname.indices) {
                val bird = bird()
                bird.name = animalname[position]
                bird.detail = animaldetail[position]
                bird.photo = animalImages[position]
                list.add(bird)
            }
            return list
        }
}
