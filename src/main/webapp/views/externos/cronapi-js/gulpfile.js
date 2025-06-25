import gulp from 'gulp';
import terser from 'gulp-terser';
import rename from 'gulp-rename';
import concat from 'gulp-concat';

gulp.task('minify', function () {
  return gulp.src('cronapi.js')
    .pipe(terser({
      mangle: {
        keep_classnames: true
      }
    }))
    .pipe(rename('cronapi.min.js'))
    .pipe(gulp.dest('dist/'));
});

gulp.task('joinfiles', gulp.series('minify'), function () {
  return gulp.src(['dist/cronapi.min.js', 'node_modules/@zxing/library/umd/index.min.js'])
    .pipe(concat('cronapi.min.js'))
    .pipe(gulp.dest('dist/'));
});

gulp.task('i18n', function () {
  return gulp.src('i18n/').pipe(gulp.dest('i18n/'));
});

gulp.task('build', gulp.series('minify', 'i18n', 'joinfiles'));

gulp.task('default', gulp.series('build'));
