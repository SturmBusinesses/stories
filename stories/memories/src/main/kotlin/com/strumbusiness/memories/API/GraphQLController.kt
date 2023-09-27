@Controller
class PostController {
    @QueryMapping
    fun recentPosts(@Argument count: Int, @Argument offset: Int): List<Post> {
        return postDao.getRecentPosts(count, offset)
    }
}