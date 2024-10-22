package com.jetpackcompose.loginwithcompose.loginscreen

import com.jetpackcompose.loginwithcompose.state.ErrorState
import com.jetpackcompose.loginwithcompose.R


val emailOrMobileEmptyErrorState = ErrorState(
    hasError = true,
    errorMessageStringResource = R.string.login_error_msg_empty_email_mobile
)

val passwordEmptyErrorState = ErrorState(
    hasError = true,
    errorMessageStringResource = R.string.login_error_msg_empty_password
)