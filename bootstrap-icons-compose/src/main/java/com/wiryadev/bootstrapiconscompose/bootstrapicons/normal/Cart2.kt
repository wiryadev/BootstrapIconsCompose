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

public val NormalGroup.Cart2: ImageVector
    get() {
        if (_cart2 != null) {
            return _cart2!!
        }
        _cart2 = Builder(name = "Cart2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.5f, 2.0f)
                lineTo(2.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.485f, 0.379f)
                lineTo(2.89f, 4.0f)
                lineTo(14.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.485f, 0.621f)
                lineToRelative(-1.5f, 6.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 13.0f, 11.0f)
                lineTo(4.0f, 11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.485f, -0.379f)
                lineTo(1.61f, 3.0f)
                lineTo(0.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(3.14f, 5.0f)
                lineToRelative(1.25f, 5.0f)
                horizontalLineToRelative(8.22f)
                lineToRelative(1.25f, -5.0f)
                lineTo(3.14f, 5.0f)
                close()
                moveTo(5.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(3.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(10.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                close()
            }
        }
        .build()
        return _cart2!!
    }

private var _cart2: ImageVector? = null
