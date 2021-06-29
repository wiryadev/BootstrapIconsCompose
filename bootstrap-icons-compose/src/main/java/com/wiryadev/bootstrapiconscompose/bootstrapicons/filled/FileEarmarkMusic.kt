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
import com.wiryadev.bootstrapiconscompose.bootstrapicons.FilledGroup

public val FilledGroup.FileEarmarkMusic: ImageVector
    get() {
        if (_fileEarmarkMusic != null) {
            return _fileEarmarkMusic!!
        }
        _fileEarmarkMusic = Builder(name = "FileEarmarkMusic", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.293f, 0.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(4.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.707f, 4.0f)
                lineTo(10.0f, 0.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.293f, 0.0f)
                close()
                moveTo(9.5f, 3.5f)
                verticalLineToRelative(-2.0f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(11.0f, 6.64f)
                verticalLineToRelative(1.75f)
                lineToRelative(-2.0f, 0.5f)
                verticalLineToRelative(3.61f)
                curveToRelative(0.0f, 0.495f, -0.301f, 0.883f, -0.662f, 1.123f)
                curveTo(7.974f, 13.866f, 7.499f, 14.0f, 7.0f, 14.0f)
                curveToRelative(-0.5f, 0.0f, -0.974f, -0.134f, -1.338f, -0.377f)
                curveToRelative(-0.36f, -0.24f, -0.662f, -0.628f, -0.662f, -1.123f)
                reflectiveCurveToRelative(0.301f, -0.883f, 0.662f, -1.123f)
                curveTo(6.026f, 11.134f, 6.501f, 11.0f, 7.0f, 11.0f)
                curveToRelative(0.356f, 0.0f, 0.7f, 0.068f, 1.0f, 0.196f)
                verticalLineTo(6.89f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.757f, -0.97f)
                lineToRelative(1.0f, -0.25f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 6.64f)
                close()
            }
        }
        .build()
        return _fileEarmarkMusic!!
    }

private var _fileEarmarkMusic: ImageVector? = null
