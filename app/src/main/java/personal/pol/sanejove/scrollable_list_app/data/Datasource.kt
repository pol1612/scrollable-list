package personal.pol.sanejove.scrollable_list_app.data

import personal.pol.sanejove.scrollable_list_app.R
import personal.pol.sanejove.scrollable_list_app.model.Affirmatioin

class Datasource {

     fun  loadAffirmations(): List<Affirmatioin>{
         return listOf<Affirmatioin>(
             Affirmatioin(R.string.affirmation_1,R.drawable.image1),
             Affirmatioin(R.string.affirmation_2,R.drawable.image2),
             Affirmatioin(R.string.affirmation_3,R.drawable.image3),
             Affirmatioin(R.string.affirmation_4,R.drawable.image4),
             Affirmatioin(R.string.affirmation_5,R.drawable.image5),
             Affirmatioin(R.string.affirmation_6,R.drawable.image6),
             Affirmatioin(R.string.affirmation_7,R.drawable.image7),
             Affirmatioin(R.string.affirmation_8,R.drawable.image8),
             Affirmatioin(R.string.affirmation_9,R.drawable.image9)
         )
     }
}