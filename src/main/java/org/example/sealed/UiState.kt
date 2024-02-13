package org.example.sealed

sealed interface UiState {

    data object Loading : UiState

    data class Success(
        val data: String,
        val timestamp: Long = 42L
    ) : UiState

    data class Error(val message: String) : UiState
}
