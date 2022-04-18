package com.example.affirmasi

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.soekarno),
            Affirmation(R.string.affirmation2, R.drawable.sjahrir),
            Affirmation(R.string.affirmation3, R.drawable.sukarni),
            Affirmation(R.string.affirmation4, R.drawable.diponegoro),
            Affirmation(R.string.affirmation5, R.drawable.hatta),
            Affirmation(R.string.affirmation6, R.drawable.kartini),

    }
}