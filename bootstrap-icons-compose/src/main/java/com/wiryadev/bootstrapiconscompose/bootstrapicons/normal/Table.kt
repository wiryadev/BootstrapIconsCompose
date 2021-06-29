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

public val NormalGroup.Table: ImageVector
    get() {
        if (_table != null) {
            return _table!!
        }
        _table = Builder(name = "Table", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(0.0f, 2.0f)
                close()
                moveTo(15.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                lineTo(15.0f, 4.0f)
                close()
                moveTo(15.0f, 8.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                lineTo(15.0f, 8.0f)
                close()
                moveTo(15.0f, 12.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 15.0f)
                verticalLineToRelative(-3.0f)
                lineTo(6.0f, 12.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(5.0f, 15.0f)
                verticalLineToRelative(-3.0f)
                lineTo(1.0f, 12.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(1.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                lineTo(5.0f, 8.0f)
                lineTo(1.0f, 8.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(1.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                lineTo(5.0f, 4.0f)
                lineTo(1.0f, 4.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(6.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                lineTo(10.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                close()
                moveTo(10.0f, 8.0f)
                lineTo(6.0f, 8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                lineTo(10.0f, 8.0f)
                close()
            }
        }
        .build()
        return _table!!
    }

private var _table: ImageVector? = null
