package com.teople.umat.feature.search

import android.content.res.Configuration
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.flowWithLifecycle
import com.teople.umat.component.ui.theme.Gray600
import com.teople.umat.component.ui.theme.UmatTheme
import com.teople.umat.component.widget.preview.UmatPreview
import com.teople.umat.feature.search.component.SearchAppBar
import com.teople.umat.feature.search.component.SearchResultRow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@Composable
fun SearchScreen(
    viewModel: SearchViewModel = hiltViewModel()
) {
    val viewState by viewModel.viewState.collectAsStateWithLifecycle()
    val lifecycle = LocalLifecycleOwner.current.lifecycle

    LaunchedEffect(Unit) {
        launch {
            viewModel.viewEvent.flowWithLifecycle(lifecycle).collectLatest { event ->
                when (event) {
                    is SearchViewModel.ViewEvent.ClickPlace -> {
                        // TODO("HomeScreen Pick Location & Keep SearchScreen BackStack")
                    }
                }
            }
        }
    }

    BackHandler {
        // TODO("BackPressed")
    }

    Scaffold(
        topBar = {
            SearchAppBar(
                actionBackPress = {
                    // TODO("BackPressed")
                },
                actionQueryInput = { query ->
                    viewModel.searchQueryInput(query)
                }
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .padding(paddingValues)
                .background(
                    color = UmatTheme.colorScheme.background
                )
                .fillMaxSize()
        ) {
            when {
                viewState.searchResult.isEmpty() -> {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(38.dp),
                        text = stringResource(id = R.string.search_result_empty),
                        textAlign = TextAlign.Center,
                        style = UmatTheme.typography.pretendardSemiBold16.copy(
                            color = Gray600
                        )
                    )
                }

                else -> {
                    LazyColumn(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        itemsIndexed(
                            items = viewState.searchResult,
                            key = { _, entity ->
                                entity.id
                            }
                        ) { index, entity ->
                            SearchResultRow(
                                item = entity,
                                actionItemClick = { item ->
                                    viewModel.onActionHandle(
                                        event = SearchViewModel.ViewEvent.ClickPlace(item)
                                    )
                                }
                            )

                            if (index < viewState.searchResult.lastIndex) {
                                Divider(
                                    color = UmatTheme.colorScheme.divider
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(group = "SearchScreen")
@Preview(group = "SearchScreen", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun SearchScreenPreview() {
    UmatPreview {
        SearchScreen()
    }
}
