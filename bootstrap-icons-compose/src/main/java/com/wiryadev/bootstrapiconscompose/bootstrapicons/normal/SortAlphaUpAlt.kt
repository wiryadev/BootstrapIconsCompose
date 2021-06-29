package com.wiryadev.bootstrapiconscompose.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wiryadev.bootstrapiconscompose.bootstrapicons.NormalGroup

public val NormalGroup.SortAlphaUpAlt: ImageVector
    get() {
        if (_sortAlphaUpAlt != null) {
            return _sortAlphaUpAlt!!
        }
        _sortAlphaUpAlt = Builder(name = "SortAlphaUpAlt", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.96f, 7.0f)
                horizontalLineTo(9.028f)
                verticalLineToRelative(-0.691f)
                lineToRelative(2.579f, -3.72f)
                verticalLineToRelative(-0.054f)
                horizontalLineTo(9.098f)
                verticalLineToRelative(-0.867f)
                horizontalLineToRelative(3.785f)
                verticalLineToRelative(0.691f)
                lineToRelative(-2.567f, 3.72f)
                verticalLineToRelative(0.054f)
                horizontalLineToRelative(2.645f)
                verticalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.082f, 12.629f)
                lineTo(9.664f, 14.0f)
                lineTo(8.598f, 14.0f)
                lineToRelative(1.789f, -5.332f)
                horizontalLineToRelative(1.234f)
                lineTo(13.402f, 14.0f)
                horizontalLineToRelative(-1.12f)
                lineToRelative(-0.419f, -1.371f)
                horizontalLineToRelative(-1.781f)
                close()
                moveTo(11.652f, 11.844f)
                lineTo(11.0f, 9.688f)
                horizontalLineToRelative(-0.047f)
                lineToRelative(-0.652f, 2.156f)
                horizontalLineToRelative(1.351f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineTo(3.707f)
                lineTo(2.354f, 4.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.708f, -0.708f)
                lineToRelative(2.0f, -1.999f)
                lineToRelative(0.007f, -0.007f)
                arcToRelative(0.498f, 0.498f, 0.0f, false, true, 0.7f, 0.006f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.707f, 0.708f)
                lineTo(4.5f, 3.707f)
                verticalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _sortAlphaUpAlt!!
    }

private var _sortAlphaUpAlt: ImageVector? = null
