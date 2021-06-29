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

public val Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 0.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 0.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                curveToRelative(0.0f, 0.538f, -0.012f, 1.05f, -0.034f, 1.536f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -1.133f, 5.89f)
                curveToRelative(-0.79f, 1.865f, -1.878f, 2.777f, -2.833f, 3.011f)
                verticalLineToRelative(2.173f)
                lineToRelative(1.425f, 0.356f)
                curveToRelative(0.194f, 0.048f, 0.377f, 0.135f, 0.537f, 0.255f)
                lineTo(13.3f, 15.1f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.3f, 0.9f)
                lineTo(3.0f, 16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.3f, -0.9f)
                lineToRelative(1.838f, -1.379f)
                curveToRelative(0.16f, -0.12f, 0.343f, -0.207f, 0.537f, -0.255f)
                lineTo(6.5f, 13.11f)
                verticalLineToRelative(-2.173f)
                curveToRelative(-0.955f, -0.234f, -2.043f, -1.146f, -2.833f, -3.012f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -1.132f, -5.89f)
                arcTo(33.076f, 33.076f, 0.0f, false, true, 2.5f, 0.5f)
                close()
                moveTo(2.599f, 3.04f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.72f, 3.935f)
                curveToRelative(-0.333f, -1.05f, -0.588f, -2.346f, -0.72f, -3.935f)
                close()
                moveTo(12.682f, 6.975f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.72f, -3.935f)
                curveToRelative(-0.133f, 1.59f, -0.388f, 2.885f, -0.72f, 3.935f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
