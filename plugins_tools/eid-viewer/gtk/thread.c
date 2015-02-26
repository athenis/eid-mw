#include <stdarg.h>
#include <stdlib.h>
#include "thread.h"

struct gost_helper {
	GObject* obj;
	const gchar* name;
	void* value;
	void(*free)(void*);
};

static gboolean gost_helper(gpointer user_data) {
	struct gost_helper* help = (struct gost_helper*) user_data;
	g_object_set(help->obj, help->name, help->value, NULL);
	if(help->free != NULL) {
		help->free(help->value);
	}
	free(help);
	return FALSE;
}

void g_object_set_threaded(GObject* obj, const gchar* property, void* value, void(*freefunc)(void*)) {
	struct gost_helper* help = malloc(sizeof(struct gost_helper));
	help->obj = obj;
	help->name = property;
	help->value = value;
	help->free = freefunc;
	g_main_context_invoke(NULL, gost_helper, help);
}
