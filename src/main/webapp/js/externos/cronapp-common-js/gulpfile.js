import gulp from 'gulp';
import ngAnnotate from 'gulp-ng-annotate-patched';
import terser from 'gulp-terser';

gulp.task('minify', function () {
  return gulp.src(['js/**/*.js'])
    .pipe(ngAnnotate())
    .pipe(terser({
      mangle: {
        keep_classnames : true
      }
    }))
    .pipe(gulp.dest('dist/js/'));
});

gulp.task('build', gulp.series('minify'));

gulp.task('default', gulp.series('build'));
