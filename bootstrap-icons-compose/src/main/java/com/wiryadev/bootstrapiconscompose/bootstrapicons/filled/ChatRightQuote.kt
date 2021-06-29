package com.wiryadev.bootstrapiconscompose.bootstrapicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val ChatRightQuote: ImageVector
    get() {
        if (_chatRightQuote != null) {
            return _chatRightQuote!!
        }
        _chatRightQuote = Builder(name = "ChatRightQuote", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(9.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.707f, 0.293f)
                lineToRelative(2.853f, 2.853f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.854f, -0.353f)
                verticalLineTo(2.0f)
                close()
                moveTo(7.194f, 4.766f)
                curveToRelative(0.087f, 0.124f, 0.163f, 0.26f, 0.227f, 0.401f)
                curveToRelative(0.428f, 0.948f, 0.393f, 2.377f, -0.942f, 3.706f)
                arcToRelative(0.446f, 0.446f, 0.0f, false, true, -0.612f, 0.01f)
                arcToRelative(0.405f, 0.405f, 0.0f, false, true, -0.011f, -0.59f)
                curveToRelative(0.419f, -0.416f, 0.672f, -0.831f, 0.809f, -1.22f)
                curveToRelative(-0.269f, 0.165f, -0.588f, 0.26f, -0.93f, 0.26f)
                curveTo(4.775f, 7.333f, 4.0f, 6.587f, 4.0f, 5.667f)
                curveTo(4.0f, 4.747f, 4.776f, 4.0f, 5.734f, 4.0f)
                curveToRelative(0.271f, 0.0f, 0.528f, 0.06f, 0.756f, 0.166f)
                lineToRelative(0.008f, 0.004f)
                curveToRelative(0.169f, 0.07f, 0.327f, 0.182f, 0.469f, 0.324f)
                curveToRelative(0.085f, 0.083f, 0.161f, 0.174f, 0.227f, 0.272f)
                close()
                moveTo(11.0f, 7.073f)
                curveToRelative(-0.269f, 0.165f, -0.588f, 0.26f, -0.93f, 0.26f)
                curveToRelative(-0.958f, 0.0f, -1.735f, -0.746f, -1.735f, -1.666f)
                curveToRelative(0.0f, -0.92f, 0.777f, -1.667f, 1.734f, -1.667f)
                curveToRelative(0.271f, 0.0f, 0.528f, 0.06f, 0.756f, 0.166f)
                lineToRelative(0.008f, 0.004f)
                curveToRelative(0.17f, 0.07f, 0.327f, 0.182f, 0.469f, 0.324f)
                curveToRelative(0.085f, 0.083f, 0.161f, 0.174f, 0.227f, 0.272f)
                curveToRelative(0.087f, 0.124f, 0.164f, 0.26f, 0.228f, 0.401f)
                curveToRelative(0.428f, 0.948f, 0.392f, 2.377f, -0.942f, 3.706f)
                arcToRelative(0.446f, 0.446f, 0.0f, false, true, -0.613f, 0.01f)
                arcToRelative(0.405f, 0.405f, 0.0f, false, true, -0.011f, -0.59f)
                curveToRelative(0.42f, -0.416f, 0.672f, -0.831f, 0.81f, -1.22f)
                close()
            }
        }
        .build()
        return _chatRightQuote!!
    }

private var _chatRightQuote: ImageVector? = null
