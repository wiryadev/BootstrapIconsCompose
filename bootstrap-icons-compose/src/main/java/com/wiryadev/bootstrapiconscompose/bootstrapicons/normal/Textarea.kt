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

public val NormalGroup.Textarea: ImageVector
    get() {
        if (_textarea != null) {
            return _textarea!!
        }
        _textarea = Builder(name = "Textarea", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(3.563f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 3.874f)
                lineTo(14.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 15.0f)
                lineTo(3.0f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                lineTo(1.5f, 9.937f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -3.874f)
                lineTo(1.5f, 2.5f)
                close()
                moveTo(2.5f, 6.063f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 3.874f)
                lineTo(2.5f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(13.5f, 9.937f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -3.874f)
                lineTo(13.5f, 2.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 13.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(3.563f)
                close()
                moveTo(2.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(14.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _textarea!!
    }

private var _textarea: ImageVector? = null
