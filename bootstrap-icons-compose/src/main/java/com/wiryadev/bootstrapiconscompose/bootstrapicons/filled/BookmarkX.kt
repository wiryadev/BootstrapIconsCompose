package com.wiryadev.bootstrapiconscompose.bootstrapicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wiryadev.bootstrapiconscompose.bootstrapicons.FilledGroup

public val FilledGroup.BookmarkX: ImageVector
    get() {
        if (_bookmarkX != null) {
            return _bookmarkX!!
        }
        _bookmarkX = Builder(name = "BookmarkX", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 15.5f)
                verticalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.74f, 0.439f)
                lineTo(8.0f, 13.069f)
                lineToRelative(-5.26f, 2.87f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 15.5f)
                close()
                moveTo(6.854f, 5.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, 0.708f)
                lineTo(7.293f, 7.0f)
                lineTo(6.146f, 8.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.708f, 0.708f)
                lineTo(8.0f, 7.707f)
                lineToRelative(1.146f, 1.147f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.708f, -0.708f)
                lineTo(8.707f, 7.0f)
                lineToRelative(1.147f, -1.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, -0.708f)
                lineTo(8.0f, 6.293f)
                lineTo(6.854f, 5.146f)
                close()
            }
        }
        .build()
        return _bookmarkX!!
    }

private var _bookmarkX: ImageVector? = null
