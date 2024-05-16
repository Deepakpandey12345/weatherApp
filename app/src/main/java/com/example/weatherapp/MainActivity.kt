package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontSynthesis.Companion.Weight
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(){
                    WeatherPage()

                }
            }
        }
    }
}
@Composable
fun WeatherPage(){

   Column(
       modifier = Modifier
           .fillMaxWidth()
           .padding(top = 64.dp, start = 16.dp, end = 16.dp),
       horizontalAlignment = Alignment.CenterHorizontally
   ) {
       MainInfo()

   }




    @Composable
     fun HeaderImage(){
         Image(
          painter = painterResource(id = R.drawable.parents ),
             contentDescription = null,
             modifier = Modifier.width(200.dp)
          )
     }
       MainInfo()
InfoTable()

}


@Composable
fun Weatherpage(){
    Image(painter = painterResource(id = R.drawable.parents), contentDescription ="couple",

        modifier = Modifier.width(200.dp))
}



   @Composable
   fun MainInfo(){
       Column(modifier = Modifier.padding(top = 24.dp),
      horizontalAlignment = Alignment.CenterHorizontally
       ) {
           Text(text = "11", color = Color.DarkGray, fontSize = 48.sp, fontWeight = FontWeight.Bold)
           Text(
               text = "BHILAI,CG",
               color = Color.DarkGray,
               fontWeight = FontWeight.Medium,
               fontSize = 20.sp,
               modifier = Modifier.padding(top = 16.dp)
           )
           Text(text =
           "Rainy to paarty cloudy.\n Winds WSW at 10 to 15 km / h",
           color= Color.Gray,
           fontSize= 16.sp,
           textAlign= TextAlign.Center,
           modifier= Modifier.padding(vertical= 24.dp)
           )
       }
       }





@Composable
fun InfoTable(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(4.dp))
          
    ){
       Row(Modifier.padding(16.dp)) {
           InfoItem(
               iconRes = R.drawable.cloud,
               title = "humidity",
               subtitle = "85%",
               modifier = Modifier.weight(
                   1f
               )
           )
           InfoItem(
               iconRes = R.drawable.cloud,
               title = "Sunrise",
               subtitle = "7:30 Am",
               modifier = Modifier.weight(
                   1f
               )
           )
       }

           Row {

           }
           InfoItem(
               iconRes = R.drawable.cloud,
               title = "Sunset",
               subtitle = "4:28 pm",
               modifier = Modifier.weight(
                   1f
               )
           )
           InfoItem(
               iconRes = R.drawable.cloud,
               title = "humidity",
               subtitle = "85%",
               modifier = Modifier.weight(
                   1f
               )
           )
       }

       }



@Composable
fun InfoItem(@DrawableRes iconRes: Int,title: String,subtitle:String,modifier: Modifier){
Row(modifier = modifier) {
Image(painter = painterResource (id = iconRes),
contentDescription = null,
    modifier = Modifier
        .padding(end = 8.dp)
        .width(40.dp)
       )
    Column {
        Text(title)
        Text(subtitle)
    }
}
}




@Preview(showBackground = true, widthDp=390,heightDp = 800)
@Composable
fun DefaultPreview() {
    WeatherAppTheme {
      Weatherpage()
        }
    }


