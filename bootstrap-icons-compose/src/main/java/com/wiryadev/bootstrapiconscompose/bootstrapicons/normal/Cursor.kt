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

public val NormalGroup.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.082f, 2.182f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.103f, 0.557f)
                lineTo(8.528f, 15.467f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.917f, -0.007f)
                lineTo(5.57f, 10.694f)
                lineTo(0.803f, 8.652f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.006f, -0.916f)
                lineToRelative(12.728f, -5.657f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.556f, 0.103f)
                close()
                moveTo(2.25f, 8.184f)
                lineToRelative(3.897f, 1.67f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.262f, 0.263f)
                lineToRelative(1.67f, 3.897f)
                lineTo(12.743f, 3.52f)
                lineTo(2.25f, 8.184f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
