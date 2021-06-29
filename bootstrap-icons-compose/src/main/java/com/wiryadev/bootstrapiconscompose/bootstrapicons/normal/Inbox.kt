package com.wiryadev.bootstrapiconscompose.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wiryadev.bootstrapiconscompose.bootstrapicons.NormalGroup

public val NormalGroup.Inbox: ImageVector
    get() {
        if (_inbox != null) {
            return _inbox!!
        }
        _inbox = Builder(name = "Inbox", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.98f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.39f, 0.188f)
                lineTo(1.54f, 8.0f)
                lineTo(6.0f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 3.0f, 0.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 8.0f)
                horizontalLineToRelative(4.46f)
                lineToRelative(-3.05f, -3.812f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 11.02f, 4.0f)
                lineTo(4.98f, 4.0f)
                close()
                moveTo(14.934f, 9.0f)
                lineTo(10.45f, 9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -4.9f, 0.0f)
                lineTo(1.066f, 9.0f)
                lineToRelative(0.32f, 2.562f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.497f, 0.438f)
                horizontalLineToRelative(12.234f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.496f, -0.438f)
                lineTo(14.933f, 9.0f)
                close()
                moveTo(3.809f, 3.563f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.981f, 3.0f)
                horizontalLineToRelative(6.038f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.172f, 0.563f)
                lineToRelative(3.7f, 4.625f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.105f, 0.374f)
                lineToRelative(-0.39f, 3.124f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.117f, 13.0f)
                lineTo(1.883f, 13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.489f, -1.314f)
                lineToRelative(-0.39f, -3.124f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.106f, -0.374f)
                lineToRelative(3.7f, -4.625f)
                close()
            }
        }
        .build()
        return _inbox!!
    }

private var _inbox: ImageVector? = null
