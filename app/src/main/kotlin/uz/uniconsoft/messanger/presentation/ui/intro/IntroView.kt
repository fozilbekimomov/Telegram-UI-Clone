package uz.uniconsoft.messanger.presentation.ui.intro

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import uz.uniconsoft.messanger.business.domain.util.StyledText
import uz.uniconsoft.messanger.business.domain.util.replaceTags

@ExperimentalPagerApi
@Composable
fun IntroPagerView(
    pagerState: PagerState,
    messages: List<String> = listOf(),
    description: List<String> = listOf()
) {
    HorizontalPager(count = messages.size, Modifier.fillMaxSize(), state = pagerState) { page ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        )
        {

            Spacer(modifier = Modifier.weight(1f))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f)
            ) {

                Text(
                    textAlign = TextAlign.Center,
                    text = messages[page],
                    modifier = Modifier
                        .fillMaxWidth(),
                    fontSize = 20.sp,
                    style = TextStyle(color = Color(0xFF444444)),
                )
                StyledText(
                    text = replaceTags(LocalContext.current, description[page]),
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    textColor = Color.Gray
                )
            }

        }
    }
}

//
//@ExperimentalPagerApi
//@Composable
//fun IntroLottieView(
//    onclick: () -> Unit,
//    pagerState: PagerState,
//    texture: () -> Unit
//) {
//    Column(modifier = Modifier.fillMaxSize())
//    {
//
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .weight(1f)
//                .padding(bottom = 16.dp),
//            verticalArrangement = Arrangement.Bottom,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//
//        }
//        Column(
//            modifier = Modifier
//                .weight(2f)
//                .fillMaxWidth()
//                .padding(
//                    start = 40.dp,
//                    top = 80.dp,
//                    bottom = 40.dp,
//                    end = 40.dp
//                ),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//
//            HorizontalPagerIndicator(
//                pagerState = pagerState,
//                modifier = Modifier
//                    .align(Alignment.CenterHorizontally)
//                    .padding(16.dp),
//                activeColor = Blue200,
//                inactiveColor = Color.Gray
//            )
//
//            Spacer(modifier = Modifier.weight(1f))
//
//            Button(
//                onClick = onclick, modifier = Modifier
//                    .height(40.dp)
//                    .padding(0.dp)
//                    .fillMaxWidth(),
//                colors = ButtonDefaults.buttonColors(Color.Transparent),
//                contentPadding = PaddingValues(0.dp)
//            )
//            {
//                Box(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .clip(RoundedCornerShape(5.dp)),
//                    contentAlignment = Alignment.Center
//                )
//                {
//
//                    Spacer(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .placeholder(
//                                visible = true,
//                                highlight = PlaceholderHighlight.shimmer(
//                                    progressForMaxAlpha = 0.2f,
//                                    animationSpec = infiniteRepeatable(
//                                        animation = tween(
//                                            durationMillis = 2000,
//                                            delayMillis = 1000,
//                                            easing = FastOutSlowInEasing
//                                        )
//                                    )
//                                ), color = Blue500
//                            )
//                    )
//
//                    Text(
//                        text = stringResource(id = R.string.StartMessaging).uppercase(),
//                        textAlign = TextAlign.Center,
//                        style = TextStyle(
//                            color = Color.White,
//                            fontSize = 16.sp
//                        )
//                    )
//                }
//            }
//        }
//    }
//}


