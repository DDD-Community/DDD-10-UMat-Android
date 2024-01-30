package com.teople.umat.component.widget.component

import android.content.res.Configuration
import androidx.compose.material3.Button
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.teople.umat.component.R
import com.teople.umat.component.ui.theme.UmatTheme
import java.text.SimpleDateFormat
import java.util.Date

/**
 * DatePicker Dialog Component
 *
 * TODO("Change Theme & Color")
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UmatDatePickerDialog(
    dateFormat: String,
    onDateSelected: (String) -> Unit,
    onDismiss: () -> Unit
) {
    val datePickerState = rememberDatePickerState()
    val selectedDate = datePickerState.selectedDateMillis?.let {
        SimpleDateFormat(dateFormat).format(Date(it))
    } ?: ""

    DatePickerDialog(
        onDismissRequest = { onDismiss() },
        confirmButton = {
            Button(
                onClick = {
                    onDateSelected(selectedDate)
                    onDismiss()
                }
            ) {
                Text(text = stringResource(id = R.string.widget_component_date_picker_confirm))
            }
        },
        dismissButton = {
            Button(
                onClick = {
                    onDismiss()
                }
            ) {
                Text(text = stringResource(id = R.string.widget_component_date_picker_cancel))
            }
        }
    ) {
        DatePicker(
            state = datePickerState
        )
    }
}

@Preview(group = "UmatDatePickerDialog")
@Preview(group = "UmatDatePickerDialog", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun UmatDatePickerDialogPreview() {
    UmatTheme {
        UmatDatePickerDialog(
            dateFormat = "yyyy.MM.dd",
            onDateSelected = {},
            onDismiss = {}
        )
    }
}
