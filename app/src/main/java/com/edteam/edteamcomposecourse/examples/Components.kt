package com.edteam.edteamcomposecourse.examples

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.edteam.edteamcomposecourse.ui.theme.BackgroundTopbar
import kotlinx.coroutines.launch

@Composable
fun MyComponents() {

    val snackbarHostState = remember {
        SnackbarHostState()
    }

    val scope = rememberCoroutineScope()

    var openDialog by remember {
        mutableStateOf(false)
    }
    var openCustomDialog by remember {
        mutableStateOf(false)
    }

    AlertDialogComponent(
        showDialog = openDialog,
        title = "AlertDialog",
        dismissOnClick = {
            openDialog = false
        }
    )

    DialogCustom(
        showDialog = openCustomDialog,
        title = "Custom",
        dismissOnClick = {
            openCustomDialog = false
        }
    )

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            MyAppBar(
                onActionClick = {
                    openDialog = true
                },
                onActionCustomClick = {
                    openCustomDialog = true
                }
            )
        },
        bottomBar = {
            BottomAppBarComponent()
        },
        floatingActionButton = {
            FabComponent(
                onClickFab = {
                    scope.launch {
                        val result = snackbarHostState.showSnackbar(
                            message = "Clicked",
                            actionLabel = "Aceptar",
                            withDismissAction = true,
                            duration = SnackbarDuration.Short
                        )
                        when (result) {
                            SnackbarResult.Dismissed -> {
                                println("Dismissed")
                            }

                            SnackbarResult.ActionPerformed -> {
                                println("ActionPerformed")
                            }
                        }
                    }

                }
            )
        },
        snackbarHost = {
            SnackbarHost(snackbarHostState)
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .padding(paddingValues)
        ) {
            Text(text = "EDTeam")
        }

    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyAppBar(
    onActionClick: () -> Unit,
    onActionCustomClick:() -> Unit
) {

    TopAppBar(
        title = {
            Text(
                text = "Bienvenidos",
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = FontFamily.Monospace
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = BackgroundTopbar,
            titleContentColor = Color.White
        ),
        navigationIcon = {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Arrow Back",
                tint = Color.White
            )
        },
        actions = {
            Row {
                IconButton(onClick = { onActionClick() }) {
                    Icon(
                        imageVector = Icons.Filled.Share,
                        contentDescription = "Share",
                        tint = Color.White
                    )
                }
                IconButton(onClick = { onActionCustomClick() }) {
                    Icon(
                        imageVector = Icons.Filled.Star,
                        contentDescription = "Star",
                        tint = Color.White
                    )
                }
            }

        },
    )

}

data class Item(
    val title: String,
    val selectedIcon: ImageVector,
    val unSelectedIcon: ImageVector,
    val badgeCount: Int? = null,
    val hasNews: Boolean
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomAppBarComponent() {

    val items = listOf(
        Item(
            title = "Home",
            selectedIcon = Icons.Filled.Home,
            unSelectedIcon = Icons.Outlined.Home,
            badgeCount = 2,
            hasNews = false
        ),
        Item(
            title = "Settings",
            selectedIcon = Icons.Filled.Settings,
            unSelectedIcon = Icons.Outlined.Settings,
            hasNews = false
        ),
        Item(
            title = "Share",
            selectedIcon = Icons.Filled.Share,
            unSelectedIcon = Icons.Outlined.Share,
            hasNews = true
        )
    )

    //Evento: Onclick de la barra de navegacion
    //Estado: Indice del item de la barra de navegación
    //Recomposicion

    var navigationSelectedItem by remember {
        mutableStateOf(0)
    }

    BottomAppBar {

        NavigationBar {
            items.forEachIndexed { index, item ->

                NavigationBarItem(
                    selected = navigationSelectedItem == index,
                    onClick = {
                        navigationSelectedItem = index
                    },
                    icon = {
                        BadgedBox(
                            badge = {
                                if (item.badgeCount != null) {
                                    Badge {
                                        Text(text = item.badgeCount.toString())
                                    }
                                } else if (item.hasNews) {
                                    Badge()
                                }
                            }
                        ) {
                            Icon(
                                imageVector = if (index == navigationSelectedItem) {
                                    item.selectedIcon
                                } else {
                                    item.unSelectedIcon
                                },
                                contentDescription = item.title
                            )
                        }

                    },
                    label = {
                        Text(text = item.title)
                    }
                )

            }
        }
    }

}

@Composable
fun FabComponent(
    onClickFab: () -> Unit
) {

    FloatingActionButton(
        onClick = {
            onClickFab()
        },
        containerColor = BackgroundTopbar
    ) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = "Add",
            tint = Color.White
        )
    }

}

@Composable
fun AlertDialogComponent(
    showDialog: Boolean,
    title: String,
    dismissOnClick: () -> Unit
) {
    //true = show, false =
    if (showDialog) {
        AlertDialog(
            onDismissRequest = { dismissOnClick() },
            title = {
                Column {
                    Text(text = title)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "EDTEAM")
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Footer")
                }
            },
            confirmButton = {
                Button(onClick = { dismissOnClick() }) {
                    Text(text = "Ok")
                }
            },
            dismissButton = {
                Button(onClick = { dismissOnClick() }) {
                    Text(text = "Dismiss")
                }
            }
        )
    }
}

@Composable
fun DialogCustom(
    showDialog: Boolean,
    title: String,
    dismissOnClick: () -> Unit
) {
    if (showDialog) {
        Dialog(
            onDismissRequest = { /*TODO*/ },
            properties = DialogProperties(
                dismissOnBackPress = false,
                dismissOnClickOutside = false
            )
        ) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(24.dp)) {
                Text(text = title)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "EDTEAM")
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Footer")
                Button(onClick = { dismissOnClick() }) {
                    Text(text = "Dismiss")
                }
            }
        }

    }
}

@Preview(showSystemUi = true)
@Composable
fun MyComponentsPreview() {
    MyComponents()
}