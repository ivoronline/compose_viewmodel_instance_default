package com.ivoronline.compose_viewmodel_instance_default

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.*

//==========================================================
// MAIN ACTIVITY
//==========================================================
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      Column {
        MyCounter1(MyViewModel())                            //Model Instance is optional Parameter
        MyCounter1(MyViewModel())                            //Model Instance is optional Parameter
      }
    }
  }
}

//==========================================================
// COUNTER (Destination Composable)
//==========================================================
@Composable
fun MyCounter1(myViewModel: MyViewModel = MyViewModel()) {                //Default Model Instance
  Button({
    myViewModel.increase(10)                                             //Call Model Functions
    myViewModel.concat  (" hi")                                          //Call Model Functions
  }) {
    Text("(Count, Name) = (${myViewModel.count}, ${myViewModel.name})")  //Display State Variables
  }
}


